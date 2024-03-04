package com.example.application.views.produtoform;

import java.sql.PreparedStatement;

import com.example.application.data.Produto;
import com.example.application.data.ProdutoRepository;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Produto Form")
@Route(value = "produto-form", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class ProdutoFormView extends Composite<VerticalLayout> {

    public ProdutoFormView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        FormLayout formLayout2Col = new FormLayout();
        TextField textFieldProduto = new TextField();
        TextField textFieldFornecedor = new TextField();
        TextField textFieldData = new TextField();
        TextField textFieldPreco = new TextField();
        HorizontalLayout layoutRow = new HorizontalLayout();
        
        Button buttonPrimary = new Button();
        buttonPrimary.addClickListener(clickEvent -> {
            Produto produto = new Produto();
            produto.setNome(textFieldProduto.getValue());
            produto.setFornecedor(textFieldFornecedor.getValue());
            produto.setUltimaDataCompra(textFieldData.getValue());
            produto.setPreco(textFieldPreco.getValue());
            // produto.setUltimaDataCompra(datePicker.getValue());
            // produto.setPreco(price.getValue());
            ProdutoRepository produtoRepository = new ProdutoRepository();

           produtoRepository.salvar(produto);
           
           textFieldProduto.clear();
           textFieldFornecedor.clear();
           textFieldData.clear();
           textFieldPreco.clear();
        });
        Button buttonPrimary2 = new Button();
        Button buttonPrimary3 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.START);
        getContent().setAlignItems(Alignment.CENTER);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setMaxWidth("800px");
        layoutColumn2.setHeight("min-content");
        h3.setText("Personal Information");
        h3.setWidth("100%");
        formLayout2Col.setWidth("100%");
        textFieldProduto.setLabel("Produto");
        textFieldFornecedor.setLabel("Fornecedor");
        textFieldData.setLabel("Data da Compra");
        textFieldPreco.setLabel("Preco");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Save");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("Edit");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary3.setText("Delete");
        buttonPrimary3.setWidth("min-content");
        buttonPrimary3.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(textFieldProduto);
        formLayout2Col.add(textFieldFornecedor);
        formLayout2Col.add(textFieldData);
        formLayout2Col.add(textFieldPreco);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonPrimary2);
        layoutRow.add(buttonPrimary3);
    }

    private void adicionaEventoBotoes(){
        
    }

}
