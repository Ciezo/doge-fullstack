import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FrontPageAdminComponent } from './front-page-admin.component';

describe('FrontPageAdminComponent', () => {
  let component: FrontPageAdminComponent;
  let fixture: ComponentFixture<FrontPageAdminComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FrontPageAdminComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FrontPageAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
